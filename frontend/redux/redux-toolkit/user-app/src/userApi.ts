const fetchApi={
    fetchUserById:async (id:number)=>{
        return {id:id,name:"govind"+id , age:id};
    }
}
export default fetchApi;