import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-agent',
  templateUrl: './agent.component.html',
  styleUrls: ['./agent.component.scss']
})
export class AgentComponent implements OnInit {

  constructor() { }

  public MockAgentState = [
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
