import { Component, OnInit } from '@angular/core';
import { CustomerService } from './customer.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'frontend';
  public customers: Customer[];

  constructor(private customerService:CustomerService){

  }

  ngOnInit(): void {
      this.getCustmers();
  }
  
  public getCustmers():void{
    this.customerService.getCustomers().subscribe(
      (output:Customer[]) => {
        this.customers = output;
      }
    )
  }

}
