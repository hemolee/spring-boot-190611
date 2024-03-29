package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.ShipperDTO;

import org.springframework.stereotype.Repository;

/**
 * SheeperMapper
 */
@Repository
public interface ShipperMapper {
    public void insertShipper(ShipperDTO shipper);
    public List<ShipperDTO> selectShippers();
    public List<ShipperDTO> selectShippersByOption(ShipperDTO option);
    public ShipperDTO selectShipperById(String shipperId);
    public void updateShipper(ShipperDTO shipper);
    public void deleteShipper(ShipperDTO shipper);
    
    
}