import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http : HttpClient) { }

  public doRegistration(user){
    return this.http.post("http://localhost:8080/save-user", user, {responseType : "text" as "json"});
  }

  public getUsers(){
    return this.http.get("http://localhost:8080/get-allUsers");
  }

  public searchUser(username){
    return this.http.get("http://localhost:8080/search-user/"+username);
  }

  public deleteUser(username){
    return this.http.get("http://localhost:8080/delete-user/"+username);
  }

}