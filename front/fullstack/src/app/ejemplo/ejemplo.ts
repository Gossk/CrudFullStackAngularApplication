import { Component } from '@angular/core';

@Component({
  selector: 'app-ejemplo',
  imports: [],
  template: '<h1> Hola , {{nombre}}, que tal? <h1>',
  templateUrl: './ejemplo.html',
  styleUrl: './ejemplo.css',
})
export class Ejemplo {
  nombre : string = "Usuario"; 

}
