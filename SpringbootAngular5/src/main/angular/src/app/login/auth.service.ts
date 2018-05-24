import { Injectable } from '@angular/core';
import { HttpClient ,HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/toPromise';
import 'rxjs/add/operator/map';
import { credential } from './interface';

@Injectable()
export class AuthService {

  constructor(private http: HttpClient) { }
  
  
  authlogin(credential: credential): Observable<any> {
    var headers: HttpHeaders = new HttpHeaders();
    let params: HttpParams = new HttpParams();
    let body = JSON.stringify({
      cUserName: credential.cUserName,
      cPassword: credential.cPassword
    })
    headers.append('Content-Type', 'application/json');
    return this.http.post("http://localhost:8070/login",body, {
      headers: headers,
      observe: 'response'
      
    });
  } 
}
