import { Component, OnInit ,ViewChild} from '@angular/core';

@Component({
  selector: 'app-connector',
  templateUrl: './connector.component.html',
  styleUrls: ['./connector.component.scss']
})
export class ConnectorComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    console.log("view init");
  }
}
