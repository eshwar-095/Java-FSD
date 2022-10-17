import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map, Observable} from 'rxjs';
import { Salary } from './salary';

@Injectable({
  providedIn: 'root'
})
export class SalaryService {

  constructor(private http:HttpClient) { }
  url='http://localhost:8085/api/salary';

  public getInfoByEmpId(employeeid:String):Observable<Salary[]>{
    return this.http.get<Salary[]>(`${this.url}/emp/${employeeid}`);
    
  }
  postData(data:any){
    return this.http.post<any>(this.url+"/",data).pipe(map((res:any)=>{
      return res;
    }))
  }

  getData(){
    return this.http.get<any>(this.url+"/").pipe(map((res:any)=>{
      return res;
    }))
  }


  updateData(data:any,id:number){
    return this.http.put<any>(this.url+"/"+id,data).pipe(map((res:any)=>{
      return res;
    }))
  }
  deleteData(id :number){
    return this.http.delete<any>(this.url+"/"+id).pipe(map((res:any)=>{
      return res;
    }))
  }


}
