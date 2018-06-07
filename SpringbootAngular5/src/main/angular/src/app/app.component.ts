import { Component, ViewChild, OnInit } from '@angular/core';
import { AquireAgentUsr } from "./app-services";
import { HttpClient ,HttpHeaders} from '@angular/common/http';
import { ConnectorComponent } from './connector/connector.component'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  
  public constructor(private aquireAgentUsr: AquireAgentUsr){}
  @ViewChild(ConnectorComponent) private connectorChild: ConnectorComponent;

  title = 'app';
  agentState: boolean = true;

  public cardsVisibility = {
    login: true,
    isLogin: true
  };

  ngOnInit() {
    var frame = document.getElementById("ifrm");
    if (frame) {
      frame.addEventListener("load", function(e) {
        this.agentState = false;
      }.bind(this),false);
    } else {
      this.agentState = false;
    }
  }
  // login(loginMessage: {username: string, password: string}) {

    
  //   const username = loginMessage.username;
  //   const password = loginMessage.password;
  //   const credentials = {
  //     'username': username,
  //     'password': password
  //   }
  //   this.aquireAgentUsr.authenticate(credentials, () => {
  //     this.cardsVisibility.login=false;
  //   });

    // this.aquireAgentUsr.acquire(username).subscribe(res => {
    //   const userInfo = res.username;
    //   const usrname = userInfo.avayaAgentUsr;
    //   const password = userInfo.avayaAgentPassword;

    //   const args = {
    //     "callbacKey": "login",
    //     "credentials": {
    //       "username": usrname,
    //       "password": password
    //     }
    //   }
      
    //   if (usrname && password) {
    //     window.frames[0].postMessage(args, "*");
    //   }
    // },err => {
    //   alert("error")
    //   console.log(err);
    // });
    
    // this.cardsVisibility.isLogin = false;
  // }
  
}
export class AgentUser  {
}
