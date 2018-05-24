import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hz',
  templateUrl: './hz.component.html',
  styleUrls: ['./hz.component.scss']
})
export class HzComponent implements OnInit {

  constructor() { }
  public MockhzAgentState = [
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
