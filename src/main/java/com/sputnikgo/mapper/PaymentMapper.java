package com.sputnikgo.mapper;


import com.sputnikgo.dto.payment.PaymentCardDto;
import com.sputnikgo.dto.payment.PaymentMethodDto;
import com.sputnikgo.dto.payment.ReceiptDto;
import com.sputnikgo.dto.payment.RefundDto;
import com.sputnikgo.model.payment.PaymentCard;
import com.sputnikgo.model.payment.PaymentMethod;
import com.sputnikgo.model.payment.Receipt;
import com.sputnikgo.model.payment.Refund;

import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    @Mappings({
            @Mapping(target = "id",        source = "id"),
            @Mapping(target = "brand",     source = "brand"),
            @Mapping(target = "last4",     source = "last4"),
            @Mapping(target = "default",   source = "isDefault"), // <-- DƏYİŞİKLİK
            @Mapping(target = "status",    source = "status")
    })
    PaymentCardDto toDto(PaymentCard entity);

    PaymentMethodDto toDto(PaymentMethod entity);

    @Mapping(target = "paymentId", source = "payment.id")
    @Mapping(target = "url",       ignore = true)
    ReceiptDto toDto(Receipt entity);

    RefundDto toDto(Refund entity);
}