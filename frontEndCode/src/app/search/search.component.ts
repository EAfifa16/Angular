import { Component, OnInit } from '@angular/core';

import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  username : String;
  user : any;

  constructor(private service : UserServiceService) { }

  ngOnInit() {
  }

  public getUserByUsername(){
    let response = this.service.searchUser(this.username);
    response.subscribe(data => this.user = data);

  }
}
