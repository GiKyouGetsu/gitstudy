import { Component, OnInit, Output, EventEmitter, Input} from '@angular/core';
import { ActivatedRoute, Router, ActivatedRouteSnapshot, RouterState, RouterStateSnapshot } from '@angular/router';
import { AuthService } from './auth.service';
import { credential } from './interface';
import 'rxjs/add/operator/map';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  isLogin : boolean = false;
  constructor(
    public router: Router,
    public activatedRoute: ActivatedRoute,
    public auth: AuthService
  ){}

  // @Output() onLogin = new EventEmitter<{username: string, password: string}>();
  @Input() IframeState: boolean;
  // @Output() onload = new EventEmitter<{username: string, password: string}>();

  /**
   * login
   */
  login(user: string, pass: string): void {
    this.isLogin = true;
    const param: credential = {
      cUserName: user,
      cPassword: pass
    }
    this.auth.authlogin(param)
    .subscribe(
      res => {
      // res => localStorage.setItem("id_token" , res.id_token)
      if (res) {
        this.router.navigateByUrl('workspace');
      }
    })
  }

  ngOnInit() {
  }

}
let userModel = {
  isLogin: false,　// 判断是否登录
  accout: '',
  password: '',
};

export default userModel;