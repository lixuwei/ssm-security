package com.lee.study.ssmSecurity.dao.impl;

import org.springframework.stereotype.Repository;

import com.lee.study.ssmSecurity.basedao.impl.BaseDaoImpl;
import com.lee.study.ssmSecurity.dao.AddressDao;
import com.lee.study.ssmSecurity.domain.Address;
@Repository("addressDao")
public class AddressDaoImpl extends BaseDaoImpl<Address> implements AddressDao{

}
