package com.brijframework.inventory.mapper.impl;

import com.brijframework.inventory.bean.UIInventory;
import com.brijframework.inventory.mapper.InventoryMapper;
import com.brijframework.inventory.model.EOCountFreq;
import com.brijframework.inventory.model.EOInventory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-27T16:44:08+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class InventoryMapperImpl implements InventoryMapper {

    @Override
    public List<EOInventory> mapToDAO(List<UIInventory> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOInventory> list = new ArrayList<EOInventory>( findAll.size() );
        for ( UIInventory uIInventory : findAll ) {
            list.add( mapToDAO( uIInventory ) );
        }

        return list;
    }

    @Override
    public List<UIInventory> mapToDTO(List<EOInventory> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<UIInventory> list = new ArrayList<UIInventory>( eoRoleDTO.size() );
        for ( EOInventory eOInventory : eoRoleDTO ) {
            list.add( mapToDTO( eOInventory ) );
        }

        return list;
    }

    @Override
    public EOInventory mapToDAO(UIInventory eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        EOInventory eOInventory = new EOInventory();

        eOInventory.setCountFreq( uIInventoryToEOCountFreq( eoRoleDTO ) );
        try {
            if ( eoRoleDTO.getBusiDate() != null ) {
                eOInventory.setBusiDate( new SimpleDateFormat( "dd/MM/yyyy" ).parse( eoRoleDTO.getBusiDate() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        eOInventory.setPosted( eoRoleDTO.isPosted() );
        eOInventory.setTotalCost( eoRoleDTO.getTotalCost() );
        eOInventory.setTotalSales( eoRoleDTO.getTotalSales() );
        eOInventory.setTheoreticalCost( eoRoleDTO.getTheoreticalCost() );
        eOInventory.setTotalInvValue( eoRoleDTO.getTotalInvValue() );
        eOInventory.setNumWarnings( eoRoleDTO.getNumWarnings() );

        return eOInventory;
    }

    @Override
    public UIInventory mapToDTO(EOInventory eoRole) {
        if ( eoRole == null ) {
            return null;
        }

        UIInventory uIInventory = new UIInventory();

        uIInventory.setCountFreq( eoRoleCountFreqId( eoRole ) );
        if ( eoRole.getBusiDate() != null ) {
            uIInventory.setBusiDate( new SimpleDateFormat( "dd/MM/yyyy" ).format( eoRole.getBusiDate() ) );
        }
        uIInventory.setPosted( eoRole.isPosted() );
        uIInventory.setTotalCost( eoRole.getTotalCost() );
        uIInventory.setTotalSales( eoRole.getTotalSales() );
        uIInventory.setTheoreticalCost( eoRole.getTheoreticalCost() );
        uIInventory.setTotalInvValue( eoRole.getTotalInvValue() );
        uIInventory.setNumWarnings( eoRole.getNumWarnings() );

        return uIInventory;
    }

    protected EOCountFreq uIInventoryToEOCountFreq(UIInventory uIInventory) {
        if ( uIInventory == null ) {
            return null;
        }

        EOCountFreq eOCountFreq = new EOCountFreq();

        eOCountFreq.id = uIInventory.getCountFreq();

        return eOCountFreq;
    }

    private long eoRoleCountFreqId(EOInventory eOInventory) {
        if ( eOInventory == null ) {
            return 0L;
        }
        EOCountFreq countFreq = eOInventory.getCountFreq();
        if ( countFreq == null ) {
            return 0L;
        }
        long id = countFreq.id;
        return id;
    }
}
