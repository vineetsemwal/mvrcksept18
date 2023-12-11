const util={

    isEqual:(arr1,arr2, comparison)=>{
        if(!arr1 || !arr2 || arr1.length!=arr2.length){
            return false;
        }
        for(let index in arr1){
            if(comparison(arr1[index], arr2[index])){
              return false;
            }
        }
        return true;

    }

};

export default util;

//const comparator=(user1,user2)=>user1.id===user2.id;

//util.isEqual([],[]  ,comparator)
