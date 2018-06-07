import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dl',
  templateUrl: './dl.component.html',
  styleUrls: ['./dl.component.scss']
})
export class DlComponent implements OnInit {

  constructor() { }
  public MockdlAgentState = [
    {
      "location": "北京" ,
      "total": 100,
      "freeAgent": 10,
      "online": 90
    },
    {
      "location": "大连" ,
      "total": 100,
      "freeAgent": 10,
      "online": 90
    },
    {
      "location": "上海" ,
      "total": 100,
      "freeAgent": 10,
      "online": 90
    },
    {
      "location": "广州" ,
      "total": 100,
      "freeAgent": 10,
      "online": 90
    },
    {
      "location": "深圳" ,
      "total": 100,
      "freeAgent": 10,
      "online": 90
    },
    {
      "location": "沈阳" ,
      "total": 100,
      "freeAgent": 10,
      "online": 90
    },
    {
      "location": "杭州" ,
      "total": 100,
      "freeAgent": 10,
      "online": 90
    }

  ]
  ngOnInit() {
  }

}
