
window.onload = function(){

        let observer = new IntersectionObserver((e)=>{
            e.forEach((row)=>{
                if(row.isIntersecting){
                    row.target.style.opacity = 1;
                    row.target.style.transform = 'translate(0%)';
                }else{
					row.target.style.opacity = 0;
				}
            })
        })


        let row1col = document.querySelector('#row1_col')
        let row1img = document.querySelector('#row1_img')
        let h = document.querySelector('#section2_h')
        let row2col = document.querySelector('#row2_col')
        let row2img = document.querySelector('#row2_img')        
        let row3col = document.querySelector('#row3_col')


        observer.observe(row1col,row1img)
        observer.observe(row1img)
        observer.observe(h)
        observer.observe(row2col)
        observer.observe(row2img)
        observer.observe(row3col)
}