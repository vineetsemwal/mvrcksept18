const fetchApi={
    fetchUserById:async (id)=>{
        return {id:id,name:"govind"+id , age:id};
    }
}
export default fetchApi;