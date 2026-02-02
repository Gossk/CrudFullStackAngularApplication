import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Customer } from '../models/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private baseUrl = 'http://localhost:8080/api/customers';

  constructor(private httpClient: HttpClient) { }
 
  getCustomerList(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(`${this.baseUrl}`);
  }
 
  createCustomer(customer: Customer): Observable<Customer> {
    return this.httpClient.post<Customer>(`${this.baseUrl}`, customer);
  }
 
  deleteCustomerById(id: number): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseUrl}/${id}`);
  }
}
