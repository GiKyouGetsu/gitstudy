import { Component, OnInit ,Output,EventEmitter} from '@angular/core';

@Component({
  selector: 'app-add-crm-user',
  templateUrl: './add-crm-user.component.html',
  styleUrls: ['./add-crm-user.component.scss']
})
export class AddCrmUserComponent {
  @Output() onLogin = new EventEmitter<{username: string, password: string}>();
  // @Output() onload = new EventEmitter<{username: string, password: string}>();

  /**
   * login
   */
  login(username: string, password: string): void{
    this.onLogin.next({username,password});
  }

  
  constructor() { }

  ngOnInit() {
  }
}
