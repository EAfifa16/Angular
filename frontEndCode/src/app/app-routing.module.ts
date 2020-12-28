import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AllUsersComponent } from './all-users/all-users.component';
import { DefaultComponent } from './default/default.component';
import { RegisterComponent } from './register/register.component';
import { SearchComponent } from './search/search.component';

const routes: Routes = [
  {
    path : "" , redirectTo : "default" , pathMatch : "full"
  },
  {
    path : "search" , component : SearchComponent
  },
  {
    path : "register" , component : RegisterComponent
  },
  {
    path : "allUsers" , component : AllUsersComponent
  },
  {
    path : "default" , component : DefaultComponent
  },
  {
    path : "**" , component : DefaultComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
