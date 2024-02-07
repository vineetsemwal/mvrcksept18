import axios from "axios";

const apiProductService={

 fetchProductById: async(id)=>{

return axios.get("url/"+id);

}

};

export default apiProductService;