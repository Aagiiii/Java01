import { Component } from '@angular/core';

@Component({
  selector: 'app-hello',      // HTML tag нэр
  standalone: true,           // Standalone component
  imports: [],                // Энд бусад component/module импортлоно
  templateUrl: './hello.html',
  styleUrls: ['./hello.css']
})
export class HelloComponent {
  title = 'Hello, Angular!';  // Property

  getMessage(): string {      // Method
    // TODO: your code here — 
    return this.title.toUpperCase()
    return '';
  }
}
