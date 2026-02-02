import { Component, OnInit, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { CustomerService } from '../../service/customer.service';
import { Customer } from '../../models/customer';

@Component({
  selector: 'app-customer-list',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './customer-list.html',
  styleUrls: ['./customer-list.css'],
})
export class CustomerList implements OnInit { 
  customers = signal<Customer[]>([]);

  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    this.listCustomers();
  }
 
  listCustomers(): void {
    this.customerService.getCustomerList().subscribe({
      next: (data: Customer[]) => this.customers.set(data), 
      error: (err) => console.error('Error fetching customers', err)
    });
  }
 
  deleteCustomer(id: number): void {
    this.customerService.deleteCustomerById(id).subscribe({
      next: () => { 
        this.listCustomers(); 
        console.log('Cliente eliminado');
      },
      error: (err) => console.error('Error deleting customer:', err)
    });
  }
}
