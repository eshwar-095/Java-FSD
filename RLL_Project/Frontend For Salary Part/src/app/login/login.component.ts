import { Component, OnInit } from '@angular/core';
import {FormGroup, FormBuilder} from '@angular/forms'
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public loginForm:FormGroup;
  public currEmpid:String;

  constructor(private formBulider:FormBuilder,private http:HttpClient,private router:Router,public loginservice:LoginService) { }

  ngOnInit(): void {
    this.loginForm=this.formBulider.group({
      employeeid:['']
    })
  }
 
  login(){
    this.http.get<any>("http://localhost:8085/api/salary/").subscribe(res=>{
      const user=res.find((a:any)=>{
        if(a.employeeid == this.loginForm.value.employeeid){
          this.currEmpid=a.employeeid;
          localStorage.setItem("employeeid",JSON.stringify(this.currEmpid));
        }
        return a.employeeid==this.loginForm.value.employeeid; 
      });
      if(user){
        alert("Login Success");
        this.loginForm.reset();
        this.router.navigate(['salary']);
      }else{
        alert("No Employee Found");
      }
    },err=>{
      alert("Something went wrong!")
    })
  }

}
