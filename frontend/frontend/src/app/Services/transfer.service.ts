import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from "src/environments/environment";
import { Observable } from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class TransferService {
  private apiserver = environment.apiBackend;
  constructor(private http:HttpClient) { }

  public transfer(trans:Transfer){
    this.http.post<Transfer>(`${this.apiserver}/transfer/add`,trans);
  }
}
