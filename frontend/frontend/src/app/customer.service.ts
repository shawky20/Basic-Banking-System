import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import  {HttpClient} from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: "root",
})
export class CustomerService {
  private apiserver = environment.apiBackend;

  constructor(private http: HttpClient) {}

  public getCustomers(): Observable<Customer[]> {
    return this.http.get<Customer[]>(`${this.apiserver}/customer/all`);
  }

  public updateCustomers(c: Customer): Observable<Customer> {
    return this.http.put<Customer>(`${this.apiserver}/customer/update`, c);
  } 

}
