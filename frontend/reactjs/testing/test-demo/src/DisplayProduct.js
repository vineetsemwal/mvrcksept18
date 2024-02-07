import { useEffect, useState } from "react"
import apiProductService from "./apiProductService";

const DisplayProduct=({id})=>{

const [state,setState]=useState({product:undefined, error:undefined, fetchInProgress:false, fetched:false });
  

useEffect(()=>{
   setState({product:undefined,fetchInProgress:true,fetched:false,error:undefined}); 
   const promise =apiProductService.fetchProductById(id);
   promise.then(response=>{
    console.log("product fetched",response.data);
    setState({product:response.data,fetchInProgress:false,fetched:true,error:undefined});
   }).catch(error=>{
    setState({product:undefined,fetchInProgress:false,fetched:true,error:error.message});
   })
},[id]);

if(state.fetchInProgress){
 return (
<div>
<h1>Product Info</h1>
    <h3 data-id="progress">Please Wait, Product is getting fetched</h3>   
    
</div>
 ) ; 
}

if(state.error){
return (
<div>
  <h3 data-id="error">Error in fetching product</h3>

</div>
);
}

if(state.fetched){
    return (<div>
    <h1>Product Info</h1>
    <label>Product ID</label> 
    <label data-id="productID">{id}</label>   
    <br/>

    <label>Product Name</label> 
    <label data-id="productName">{state.product.name}</label> 
    </div>);
}


}

export default DisplayProduct;