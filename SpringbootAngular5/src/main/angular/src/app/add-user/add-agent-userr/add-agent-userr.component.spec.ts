import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddAgentUserrComponent } from './add-agent-userr.component';

describe('AddAgentUserrComponent', () => {
  let component: AddAgentUserrComponent;
  let fixture: ComponentFixture<AddAgentUserrComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddAgentUserrComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddAgentUserrComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
