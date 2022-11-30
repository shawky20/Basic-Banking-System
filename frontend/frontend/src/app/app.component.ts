import { Component, OnInit } from '@angular/core';
import { CustomerService } from './customer.service';
import { TransferService } from './transfer.service';

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"],
})
export class AppComponent implements OnInit {
  title = "frontend";
  public customers: Customer[];
  private currentCustomer: Customer;
  private newTransfer: Transfer;
  constructor(private customerService: CustomerService,private tansferService:TransferService) {}

  ngOnInit(): void {
     this.getCustmers();


  }

  public getCustmers(): void {
    this.customerService.getCustomers().subscribe((output: Customer[]) => {
      this.customers = output;
    });
  }

  transferClicked(to: Customer) {
    this.currentCustomer.id = 1;
    console.log("clicked");

    this.newTransfer.from = this.currentCustomer;
    this.newTransfer.to = to;
    this.tansferService.transfer(this.newTransfer);
  }
}
