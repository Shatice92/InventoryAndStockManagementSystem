package org.hatice.inventoryandstockmanagementsystem.mapper;

import org.hatice.inventoryandstockmanagementsystem.dto.request.productrequestdto.ProductSaveDto;
import org.hatice.inventoryandstockmanagementsystem.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy =
		ReportingPolicy.IGNORE)
public interface ProductMapper {
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
	@Mapping(target = "updatedAt", expression = "java(java.time.LocalDateTime.now())")
	@Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
	Product fromProductSaveDto(ProductSaveDto dto);
	
	
	
	
	
}