import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule, JsonpModule, Http} from '@angular/http';
import { HttpClientModule, HttpClient, HttpInterceptor, HttpRequest,  HttpHandler, HTTP_INTERCEPTORS} from '@angular/common/http';
import { AquireAgentUsr } from "./app-services";
import { RouterModule } from '@angular/router';
import { routes } from './app.rootes'

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { CommonModule } from '@angular/common';
import { DlComponent } from './bz-modules/dl/dl.component';
import { ShComponent } from './bz-modules/sh/sh.component';
import { HzComponent } from './bz-modules/hz/hz.component';
import { AuthService } from './login/auth.service';
import { RouteguardService } from './RouteguardService';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent
  ],
  imports: [
    CommonModule,
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [
    AquireAgentUsr,
    AuthService,
    RouteguardService
  ],
  bootstrap: [AppComponent]
})
// export class AppModule implements HttpInterceptor { 
//   intercept(req: HttpRequest<any>, next: HttpHandler) {
//     const xhr = req.clone({
//       headers: req.headers.set('X-Requested-With', 'XMLHttpRequest')
//     });
//     return next.handle(xhr);
//   }
// }
export class AppModule {}
