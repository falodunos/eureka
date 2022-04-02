package com.microservices.currencyconversionservice;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="legallynx-api-gateway-server")
@RibbonClient(name="exchange")
public interface CurrencyExchangeServiceProxy 
{
//mapping for currency-exchange-service
//@GetMapping("/currency-exchange/from/{from}/to/{to}")		//where {from} and {to} are path variable

//mapping for zuul-api-gateway-server
@GetMapping("/exchange/currency-exchange/from/{from}/to/{to}")
public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to); //from map to USD and to map to INR
}