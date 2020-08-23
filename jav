function showSubmenu() {
  const submenu = document.getElementsByClassName("sub__menu") [0];
  submenu.style.display = "inline-block";
}

function hideSubmenu() {
  const submenu = document.getElementsByClassName("sub__menu") [0] ;
  submenu.style.display = "none";
}

const menuItems = document.getElementsByClassName("Point");
for (const menuItem of menuItems) {
  menuItem.onmouseenter = showSubmenu
}

const menu = document.getElementsByClassName("Point")[0];
menu.onmouseleave = hideSubmenu
