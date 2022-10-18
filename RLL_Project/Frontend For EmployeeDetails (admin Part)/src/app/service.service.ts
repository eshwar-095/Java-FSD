import { Injectable } from '@angular/core';
import { map } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  constructor(private http:HttpClient) { }
  url:string="http://localhost:8085/api/user";
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

  getDataById(id:number){
    return this.http.get<any>(this.url+"/"+id).pipe(map((res:any)=>{
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
