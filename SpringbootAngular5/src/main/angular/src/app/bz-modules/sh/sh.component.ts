import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sh',
  templateUrl: './sh.component.html',
  styleUrls: ['./sh.component.scss']
})
export class ShComponent implements OnInit {
  public MocshAgentState = [
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
  constructor() { }

  ngOnInit() {
  }

}
