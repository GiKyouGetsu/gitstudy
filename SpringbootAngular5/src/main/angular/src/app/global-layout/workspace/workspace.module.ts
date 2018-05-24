import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { LeftNavComponent } from '../left-nav/left-nav.component';
import { TopMenuComponent } from '../top-menu/top-menu.component';
import { WorkspaceComponent } from './workspace.component';
import { workspaceRoutes } from './workspace.routes';
import { AgentComponent } from '../../bz-modules/agent/agent.component';
import { DlComponent } from '../../bz-modules/dl/dl.component';
import { HzComponent } from '../../bz-modules/hz/hz.component';
import { ShComponent } from '../../bz-modules/sh/sh.component';
import { CommonModule } from '@angular/common';

@NgModule({
    imports: [
        CommonModule,
        RouterModule.forChild(workspaceRoutes)
    ],
    exports: [],
    declarations: [
        WorkspaceComponent,
        LeftNavComponent,
        AgentComponent,
        TopMenuComponent,
        DlComponent,
        HzComponent,
        ShComponent
    ],
    providers: []
})
export class WorkspaceModule { }