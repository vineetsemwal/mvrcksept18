import css1Module from  "./css1.module.css";
import css2Module from "./css2.module.css";

function CssDemo(){
    return(
        <div>
        <h1>Css Demo</h1>

         <div className={css1Module.box}>
           I am a box  1
         </div>

         <div className={css2Module.box}>
           I am a box  2
         </div>
        </div>
    )
}

export default CssDemo;