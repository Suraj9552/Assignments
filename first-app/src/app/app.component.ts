import { Component } from '@angular/core';
import {Customer, Account, PrimeAccount } from './customermodel/customer';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css']
})
export class AppComponent {
  title:string = 'first-app';

  description:string="our first attempt at writing";
 

  acc1:Account = new Account(20000);
  acc2:Account = new Account(25000);

  primeAcc1:PrimeAccount = new PrimeAccount(30000, 100);
  primeAcc2:PrimeAccount = new PrimeAccount(50000, 300);
  customer1:Customer = new Customer(1, "Thomas", this.acc1);
  customer2:Customer = new Customer(2, "Eric", this.acc2);
  customer3:Customer = new Customer(3, "Lucy", this.primeAcc1);
  customer4:Customer = new Customer(4, "john", this.primeAcc2);

 customers = [this.customer1, this.customer2, this.customer3, this.customer4];

}
