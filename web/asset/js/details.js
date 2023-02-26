function Slider(list) {
   var listImg = list;
   var current = list[0];
   var blurImg = "filter: brightness(50%) contrast(80%) !important";
   var highlightImg = "filter: brightness(100%) contrast(100%) !important";
   var imgBottomList = [];
   const slider = document.getElementById("slider");
   const sliderBottom = slider.querySelector(".slider_bottom");
   const img = slider.querySelector(".img");
   const sliderPre = slider.querySelector(".control_left");
   const sliderNext = slider.querySelector(".control_right");
   const imgRepos = slider.querySelector(".img_repos");
   console.log(slider);
   console.log(sliderPre);
   function firstAppend() {
      let img = slider.querySelector("#img");
      let newImg = document.createElement("img");
      newImg.src = list[0].link;
      img.querySelector(".img_repos").appendChild(newImg);

      list.forEach((element, i) => {
         let newImgBottom = document.createElement("img");
         newImgBottom.src = element.link;
         newImgBottom.classList.add(`img${i}`);
         console.log(newImgBottom.classList);
         sliderBottom.appendChild(newImgBottom);
         imgBottomList.push(newImgBottom);
         if (i == 0) {
            newImgBottom.setAttribute("style", highlightImg);
         }
      });
   }
   firstAppend();

   sliderPre.onclick = function (e) {
      let newImg = document.createElement("img");
      let i = current.index;
      sliderBottom.querySelector(`.img${i}`).setAttribute("style", blurImg);
      let pre = current;
      let preImg = imgRepos.querySelector(`img[src="${pre.link}"]`);
      console.log(preImg);
      if (i == 0) {
         i = list.length - 1;
         current = list[list.length - 1];
      } else {
         i = i - 1;
         current = list[i];
      }
      sliderBottom.querySelector(`.img${i}`).setAttribute("style", highlightImg);
      newImg.src = current.link;
      newImg.style.transform = "translateX(-100%)";
      console.log(current);
      imgRepos.appendChild(newImg);
      newImg.style.zIndex = "10";
      setTimeout(function () {
         newImg.style.transform = "";
         preImg.style.transform = "translateX(100%)";
      }, 1);
      setTimeout(function () {
         preImg.remove();
      }, 200);
   };

   sliderNext.onclick = function (e) {
      let newImg = document.createElement("img");
      let i = current.index;
      sliderBottom.querySelector(`.img${i}`).setAttribute("style", blurImg);
      let pre = current;
      let preImg = imgRepos.querySelector(`img[src="${pre.link}"]`);
      console.log(current.link, "link ne");
      if (i == list.length - 1) {
         i = 0;
         current = list[0];
      } else {
         i = i + 1;
         current = list[i];
      }
      sliderBottom.querySelector(`.img${i}`).setAttribute("style", highlightImg);
      newImg.src = current.link;
      newImg.style.transform = "translateX(100%)";
      console.log(current);
      imgRepos.appendChild(newImg);
      newImg.style.zIndex = "10";

      setTimeout(function () {
         newImg.style.transform = "";
         preImg.style.transform = "translateX(-100%)";
      }, 1);
      setTimeout(function () {
         preImg.remove();
      }, 200);
   };
   imgBottomList.forEach(function (img, i) {
      img.onclick = (e) => {
         if (e.target.classList.contains(`img${current.index}`)) {
         } else {
            let newImg = document.createElement("img");
            let pre = current;
            let preImg = imgRepos.querySelector(`img[src="${pre.link}"]`);
            sliderBottom.querySelector(`.img${current.index}`).
            setAttribute("style", blurImg);

            current = {
               link: e.target.src,
               index: i,
            };
            sliderBottom.querySelector(`.img${i}`).setAttribute("style", highlightImg);
            newImg.src = current.link;
            let back = "translateX(-100%)";
            let next = "translateX(100%)";
            if(pre.index > current.index) {
               let k = back;
               back = next;
               next = k;
            }

            newImg.style.transform = next;
            imgRepos.appendChild(newImg);
            newImg.style.zIndex = "10";
            setTimeout(function () {
               newImg.style.transform = "";
               preImg.style.transform = back;
            }, 1);
            setTimeout(function () {
               preImg.remove();
            }, 200);
         }
      };
   });
}
