package com.algoDomain.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SellerNotFound extends  RuntimeException{
	public SellerNotFound(String message) {
 	   super(message);
    }
}
