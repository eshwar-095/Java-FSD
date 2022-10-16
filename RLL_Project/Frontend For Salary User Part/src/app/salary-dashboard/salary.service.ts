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

  public getAllInfo(employeeid:String):Observable<Salary[]>{
    return this.http.get<Salary[]>(`${this.url}/emp/${employeeid}`);
    
  }


}
