-- 
-- Apache Derby scripts by Steve Stewart, updated by Ronald Pomeroy
-- Based on Srinivas Venkatarangaiah's file for Cloudscape
-- 
-- In your Quartz properties file, you'll need to set
-- org.quartz.jobStore.driverDelegateClass = org.quartz.impl.jdbcjobstore.StdJDBCDelegate
-- 
-- Known to work with Apache Derby 10.0.2.1
-- 

drop table jahia_qrtz_locks;
drop table jahia_qrtz_scheduler_state;
drop table jahia_qrtz_fired_triggers;
drop table jahia_qrtz_paused_trigger_grps;
drop table jahia_qrtz_calendars;
drop table jahia_qrtz_trigger_listeners;
drop table jahia_qrtz_blob_triggers;
drop table jahia_qrtz_cron_triggers;
drop table jahia_qrtz_simple_triggers;
drop table jahia_qrtz_triggers;
drop table jahia_qrtz_job_listeners;
drop table jahia_qrtz_job_details;

create table jahia_qrtz_job_details (
job_name varchar(200) not null,
job_group varchar(200) not null,
description varchar(250) ,
job_class_name varchar(250) not null,
is_durable varchar(5) not null,
is_volatile varchar(5) not null,
is_stateful varchar(5) not null,
requests_recovery varchar(5) not null,
job_data blob,
primary key (job_name,job_group)
);

create table jahia_qrtz_job_listeners(
job_name varchar(200) not null,
job_group varchar(200) not null,
job_listener varchar(200) not null,
primary key (job_name,job_group,job_listener),
foreign key (job_name,job_group) references jahia_qrtz_job_details(job_name,job_group)
);

create table jahia_qrtz_triggers(
trigger_name varchar(200) not null,
trigger_group varchar(200) not null,
job_name varchar(200) not null,
job_group varchar(200) not null,
is_volatile varchar(5) not null,
description varchar(250),
next_fire_time bigint,
prev_fire_time bigint,
priority integer,
trigger_state varchar(16) not null,
trigger_type varchar(8) not null,
start_time bigint not null,
end_time bigint,
calendar_name varchar(200),
misfire_instr smallint,
job_data blob,
primary key (trigger_name,trigger_group),
foreign key (job_name,job_group) references jahia_qrtz_job_details(job_name,job_group)
);

create table jahia_qrtz_simple_triggers(
trigger_name varchar(200) not null,
trigger_group varchar(200) not null,
repeat_count bigint not null,
repeat_interval bigint not null,
times_triggered bigint not null,
primary key (trigger_name,trigger_group),
foreign key (trigger_name,trigger_group) references jahia_qrtz_triggers(trigger_name,trigger_group)
);

create table jahia_qrtz_cron_triggers(
trigger_name varchar(200) not null,
trigger_group varchar(200) not null,
cron_expression varchar(120) not null,
time_zone_id varchar(80),
primary key (trigger_name,trigger_group),
foreign key (trigger_name,trigger_group) references jahia_qrtz_triggers(trigger_name,trigger_group)
);

create table jahia_qrtz_blob_triggers(
trigger_name varchar(200) not null,
trigger_group varchar(200) not null,
blob_data blob,
primary key (trigger_name,trigger_group),
foreign key (trigger_name,trigger_group) references jahia_qrtz_triggers(trigger_name,trigger_group)
);

create table jahia_qrtz_trigger_listeners(
trigger_name varchar(200) not null,
trigger_group varchar(200) not null,
trigger_listener varchar(200) not null,
primary key (trigger_name,trigger_group,trigger_listener),
foreign key (trigger_name,trigger_group) references jahia_qrtz_triggers(trigger_name,trigger_group)
);

create table jahia_qrtz_calendars(
calendar_name varchar(200) not null,
calendar blob not null,
primary key (calendar_name)
);

create table jahia_qrtz_paused_trigger_grps
  (
    trigger_group varchar(200) not null,
primary key (trigger_group)
);

create table jahia_qrtz_fired_triggers(
entry_id varchar(95) not null,
trigger_name varchar(200) not null,
trigger_group varchar(200) not null,
is_volatile varchar(5) not null,
instance_name varchar(200) not null,
fired_time bigint not null,
priority integer not null,
state varchar(16) not null,
job_name varchar(200),
job_group varchar(200),
is_stateful varchar(5),
requests_recovery varchar(5),
primary key (entry_id)
);

create table jahia_qrtz_scheduler_state
  (
    instance_name varchar(200) not null,
    last_checkin_time bigint not null,
    checkin_interval bigint not null,
primary key (instance_name)
);

create table jahia_qrtz_locks
  (
    lock_name varchar(40) not null,
primary key (lock_name)
);

insert into jahia_qrtz_locks values('TRIGGER_ACCESS');
insert into jahia_qrtz_locks values('JOB_ACCESS');
insert into jahia_qrtz_locks values('CALENDAR_ACCESS');
insert into jahia_qrtz_locks values('STATE_ACCESS');
insert into jahia_qrtz_locks values('MISFIRE_ACCESS');