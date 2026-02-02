import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { CustomerService } from '../../service/customer.service';
import { Customer } from '../../models/customer';

@Component({
  selector: 'app-customer-add',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './customer-add.html',
  styleUrls: ['./customer-add.css'],
})
export class CustomerAdd {

  firstName: string = '';
  lastName: string = '';
  email: string = '';

  constructor(
    private customerService: CustomerService,
    private router: Router
  ) {}

  addCustomer(): void {
    const customer: Customer = {
      firstName: this.firstName,
      lastName: this.lastName,
      email: this.email
    }; 

    this.customerService.createCustomer(customer).subscribe({
      next: (data) => {
        console.log('Customer creado:', data);
        this.router.navigate(['/']);
      },
      error: (err) => {
        console.error('Error backend:', err);
        alert('Ocurrió un error al crear el customer. Revisa los datos.');
      }
    });
  }
}
