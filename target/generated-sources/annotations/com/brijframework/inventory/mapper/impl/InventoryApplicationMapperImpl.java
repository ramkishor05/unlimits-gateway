package com.brijframework.inventory.mapper.impl;

import com.brijframework.inventory.bean.UIInventoryApplication;
import com.brijframework.inventory.mapper.InventoryApplicationMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-06T19:58:37+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class InventoryApplicationMapperImpl implements InventoryApplicationMapper {

    @Override
    public UIInventoryApplication mapToDTO(EOInventoryApp eoRole) {
        if ( eoRole == null ) {
            return null;
        }

        UIInventoryApplication uIInventoryApplication = new UIInventoryApplication();

        uIInventoryApplication.setId( eoRole.getId() );
        uIInventoryApplication.setAppid( eoRole.getAppid() );
        uIInventoryApplication.setCustId( eoRole.getCustId() );

        return uIInventoryApplication;
    }

    @Override
    public EOInventoryApp mapToDAO(UIInventoryApplication eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        EOInventoryApp eOInventoryApp = new EOInventoryApp();

        eOInventoryApp.setId( eoRoleDTO.getId() );
        eOInventoryApp.setAppid( eoRoleDTO.getAppid() );
        eOInventoryApp.setCustId( eoRoleDTO.getCustId() );

        return eOInventoryApp;
    }

    @Override
    public List<EOInventoryApp> mapToDAO(List<UIInventoryApplication> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOInventoryApp> list = new ArrayList<EOInventoryApp>( findAll.size() );
        for ( UIInventoryApplication uIInventoryApplication : findAll ) {
            list.add( mapToDAO( uIInventoryApplication ) );
        }

        return list;
    }

    @Override
    public List<UIInventoryApplication> mapToDTO(List<EOInventoryApp> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<UIInventoryApplication> list = new ArrayList<UIInventoryApplication>( eoRoleDTO.size() );
        for ( EOInventoryApp eOInventoryApp : eoRoleDTO ) {
            list.add( mapToDTO( eOInventoryApp ) );
        }

        return list;
    }
}
