import { WorkspaceComponent } from './workspace.component';
import { OrgComponent } from './../../bz-modules/org/org.component'
import { AgentComponent } from '../../bz-modules/agent/agent.component';
import { DlComponent } from '../../bz-modules/dl/dl.component';
import { HzComponent } from '../../bz-modules/hz/hz.component';
import { ShComponent } from '../../bz-modules/sh/sh.component';

export const workspaceRoutes = [
	{
		path: '',
		component: WorkspaceComponent,
		children: [
			{ path: '', redirectTo: 'agent', pathMatch: 'full' },
			// { path: 'post', loadChildren: '../../bz-modules/post/post.module#PostModule' },
			// { path: 'comment', loadChildren: '../../bz-modules/comment/comment.module#CommentModule' },
			{ path: 'agent', component: AgentComponent },
			{ path: 'dlagent', component: DlComponent},
			{ path: 'hzagent', component: HzComponent},
			{ path: 'shagent', component: ShComponent}
			// { path: 'user', loadChildren: '../../bz-modules/user/user.module#UserModule' },
			// { path: 'role', loadChildren: '../../bz-modules/role/role.module#RoleModule' },
			// { path: 'permission', loadChildren: '../../bz-modules/permission/permission.module#PermissionModule' },
			// { path: 'sys', loadChildren: '../../bz-modules/sys/sys.module#SysModule' },
			// { path: 'map', loadChildren: '../../bz-modules/map/map.module#MapModule' }
        ]
	}
];