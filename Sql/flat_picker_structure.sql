create table if not exists flat_picker_structure(
record_key Integer not null,
flat_file_picker_code Integer null,
flat_file_picker_code_position varchar(255) null,
flat_file_picker_code_length varchar(255) null,
file_check_sum_digits_position varchar(255) null,
file_check_sum_digits_length varchar(255) null,
checksum_identifier_position char null,
checksum_identifier_length varchar(255) null,
source_app_id_position varchar(255) null,
source_app_id_length varchar(255) null,
host_identifier varchar(255) null,
host_push_api_config varchar(255) null,
footer_content varchar(255) null,
show_count varchar(255) null,
constraint flat_picker_structure_pk primary key(record_key));