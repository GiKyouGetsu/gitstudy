import { HttpClient ,HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/toPromise';

@Injectable()
export class  AquireAgentUsr {

    authenticated = false;
    constructor(private $http: HttpClient) {
    }

    public acquire(username : string): Observable<any> {
        return this.$http.get('av/getAvAgent/' + username);
    }

    // authenticate(credentials: credential, callback) {

    //     const headers = new HttpHeaders(credentials ? {
    //         anthorization: 'basic ' + btoa(credentials.username + ':' + credentials.password)
    //     } : {});

    //     this.$http.get('crm/user', {headers: headers}).subscribe(res => {
    //         if (res['name']) {
    //             this.authenticated = true;
    //         } else {
    //             this.authenticated = false;
    //         }
    //         return callback && callback();
    //     })
    // }
}

interface credential {
    username: string,
    password: string
}