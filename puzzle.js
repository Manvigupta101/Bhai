const puzzle = document.getElementById("puzzle");
let pieces = [];

for (let i = 0; i < 9; i++) {
  const piece = document.createElement("div");
  piece.className = "puzzle-piece";

  // background-size is already 300% 300% in CSS
  const x = (i % 3) * 100;
  const y = Math.floor(i / 3) * 100;
  piece.style.backgroundPosition = `-${x}% -${y}%`;

  piece.setAttribute("data-index", i);
  piece.draggable = true;
  pieces.push(piece);
}

shuffle(pieces);
pieces.forEach(p => puzzle.appendChild(p));

function shuffle(arr) {
  for (let i = arr.length - 1; i > 0; i--) {
    let j = Math.floor(Math.random() * (i + 1));
    [arr[i], arr[j]] = [arr[j], arr[i]];
  }
}

// Drag and Drop logic
let dragSrcEl = null;

puzzle.addEventListener('dragstart', function (e) {
  if (e.target.classList.contains("puzzle-piece")) {
    dragSrcEl = e.target;
    e.dataTransfer.setData("text/plain", "");
  }
});

puzzle.addEventListener('dragover', function (e) {
  e.preventDefault();
});

puzzle.addEventListener('drop', function (e) {
  e.preventDefault();
  if (e.target.classList.contains("puzzle-piece") && dragSrcEl !== e.target) {
    const temp = document.createElement("div");
    puzzle.insertBefore(temp, dragSrcEl);
    puzzle.insertBefore(dragSrcEl, e.target);
    puzzle.insertBefore(e.target, temp);
    puzzle.removeChild(temp);
  }
});

function checkPuzzle() {
  const current = [...puzzle.children];
  const correct = current.every((piece, i) => piece.getAttribute("data-index") == i);
  if (correct) {
    alert("Well done Bhai! 🎉❤️");
    document.getElementById("goToNote").submit();
  } else {
    alert("Oops! Try again...");
  }
}
