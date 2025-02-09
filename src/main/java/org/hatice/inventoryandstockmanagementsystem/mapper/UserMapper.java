package org.hatice.inventoryandstockmanagementsystem.mapper;

import org.hatice.inventoryandstockmanagementsystem.dto.request.userrequestdto.UserRegisterDto;
import org.hatice.inventoryandstockmanagementsystem.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy =
		ReportingPolicy.IGNORE)
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	@Mapping(target = "createdDate", expression = "java(java.time.LocalDateTime.now())")
	User fromUserRegisterDto(UserRegisterDto dto);
}