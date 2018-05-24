import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { AddCrmUserComponent } from './add-user/add-crm-user/add-crm-user.component'
import { AddAgentUserrComponent } from './add-user/add-agent-userr/add-agent-userr.component'
import { LoginComponent } from './login/login.component';
import { RouteguardService } from './RouteguardService';

export const routes: Routes = [
  {
    path: '',
		redirectTo: 'login',
		pathMatch: 'full'
  },
  {
    path: 'login', 
    component: LoginComponent,
    canActivate: [RouteguardService]

  },
  {
    path: "workspace",
    loadChildren: './global-layout/workspace/workspace.module#WorkspaceModule',
    canActivate: [RouteguardService]
  },
	{
		path: '**', // fallback router must in the last
		component: LoginComponent
	}
];

