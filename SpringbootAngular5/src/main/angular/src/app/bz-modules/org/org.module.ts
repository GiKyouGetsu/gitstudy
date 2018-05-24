import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RouterModule } from '@angular/router';
import { OrgComponent } from './org.component';
import { OrgMngComponent } from './org-mng/org-mng.component'
import { orgRoutes } from './org.routes'

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(orgRoutes)
  ],
  declarations: [
    OrgComponent,
    OrgMngComponent

  ],
  providers: [
  ]
})
export class OrgModule { }
