package com.brijframework.inventory.mapper.impl;

import com.brijframework.inventory.bean.UIInventoryManager;
import com.brijframework.inventory.mapper.InventoryManagerMapper;
import com.brijframework.inventory.model.EOGlobalCountFreq;
import com.brijframework.inventory.model.EOInventoryManager;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-05T23:46:26+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
@Component
public class InventoryManagerMapperImpl implements InventoryManagerMapper {

    @Override
    public List<EOInventoryManager> mapToDAO(List<UIInventoryManager> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOInventoryManager> list = new ArrayList<EOInventoryManager>( findAll.size() );
        for ( UIInventoryManager uIInventoryManager : findAll ) {
            list.add( mapToDAO( uIInventoryManager ) );
        }

        return list;
    }

    @Override
    public List<UIInventoryManager> mapToDTO(List<EOInventoryManager> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<UIInventoryManager> list = new ArrayList<UIInventoryManager>( eoRoleDTO.size() );
        for ( EOInventoryManager eOInventoryManager : eoRoleDTO ) {
            list.add( mapToDTO( eOInventoryManager ) );
        }

        return list;
    }

    @Override
    public EOInventoryManager mapToDAO(UIInventoryManager eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        EOInventoryManager eOInventoryManager = new EOInventoryManager();

        eOInventoryManager.setCountFreq( uIInventoryManagerToEOGlobalCountFreq( eoRoleDTO ) );
        eOInventoryManager.setBusiDate( eoRoleDTO.getBusiDate() );
        eOInventoryManager.setPosted( eoRoleDTO.isPosted() );
        eOInventoryManager.setTotalCost( eoRoleDTO.getTotalCost() );
        eOInventoryManager.setTotalSales( eoRoleDTO.getTotalSales() );
        eOInventoryManager.setTheoreticalCost( eoRoleDTO.getTheoreticalCost() );
        eOInventoryManager.setTotalInvValue( eoRoleDTO.getTotalInvValue() );
        eOInventoryManager.setNumWarnings( eoRoleDTO.getNumWarnings() );

        return eOInventoryManager;
    }

    @Override
    public UIInventoryManager mapToDTO(EOInventoryManager eoRole) {
        if ( eoRole == null ) {
            return null;
        }

        UIInventoryManager uIInventoryManager = new UIInventoryManager();

        uIInventoryManager.setCountFreq( eoRoleCountFreqId( eoRole ) );
        uIInventoryManager.setBusiDate( eoRole.getBusiDate() );
        uIInventoryManager.setPosted( eoRole.isPosted() );
        uIInventoryManager.setTotalCost( eoRole.getTotalCost() );
        uIInventoryManager.setTotalSales( eoRole.getTotalSales() );
        uIInventoryManager.setTheoreticalCost( eoRole.getTheoreticalCost() );
        uIInventoryManager.setTotalInvValue( eoRole.getTotalInvValue() );
        uIInventoryManager.setNumWarnings( eoRole.getNumWarnings() );

        return uIInventoryManager;
    }

    protected EOGlobalCountFreq uIInventoryManagerToEOGlobalCountFreq(UIInventoryManager uIInventoryManager) {
        if ( uIInventoryManager == null ) {
            return null;
        }

        EOGlobalCountFreq eOGlobalCountFreq = new EOGlobalCountFreq();

        eOGlobalCountFreq.setId( uIInventoryManager.getCountFreq() );

        return eOGlobalCountFreq;
    }

    private long eoRoleCountFreqId(EOInventoryManager eOInventoryManager) {
        if ( eOInventoryManager == null ) {
            return 0L;
        }
        EOGlobalCountFreq countFreq = eOInventoryManager.getCountFreq();
        if ( countFreq == null ) {
            return 0L;
        }
        long id = countFreq.getId();
        return id;
    }
}
