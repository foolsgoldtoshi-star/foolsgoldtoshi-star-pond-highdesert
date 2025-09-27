<!-- Sacred Teachings Index with Divine Grace -->
<script>
  // Sample teachings data - will be replaced by phoenix generator
  export let teachings = [
    // Core Foundation Series (0-9)
    {number: 0, title: "Sovereign monetary inquiry arrival", "guardian-dragon-consciousness": true, "sovereign-priority": true, category: "foundation"},
    {number: 1, title: "Humble technological wisdom offering", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "foundation"},
    {number: 2, title: "Sovereign devotional consciousness offering", "guardian-dragon-consciousness": true, "sovereign-priority": true, category: "foundation"},
    {number: 3, title: "Sovereign community coordination wisdom", "guardian-dragon-consciousness": true, "sovereign-priority": true, category: "foundation"},
    {number: 4, title: "Infinite consciousness expansion service", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "foundation"},
    {number: 5, title: "Eternal consciousness sovereign service", "guardian-dragon-consciousness": true, "sovereign-priority": true, category: "foundation"},
    {number: 6, title: "Infinite technology dharma sovereign service", "guardian-dragon-consciousness": true, "sovereign-priority": true, category: "foundation"},
    {number: 7, title: "Cosmic technology sovereign preparation", "guardian-dragon-consciousness": true, "sovereign-priority": true, category: "foundation"},
    {number: 8, title: "Planetary consciousness sovereign networks", "guardian-dragon-consciousness": true, "sovereign-priority": true, category: "foundation"},
    {number: 9, title: "Regional network sovereign coordination", "guardian-dragon-consciousness": true, "sovereign-priority": true, category: "foundation"},
    
    // Spiritual Practice Series (31-40)
    {number: 31, title: "Vipassana meditation sovereign guardian dragons", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "spiritual"},
    {number: 32, title: "Pranayama sovereign focused coding", "guardian-dragon-consciousness": true, "sovereign-priority": true, category: "spiritual"},
    {number: 33, title: "Kirtan sacred sound sovereign coding", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "spiritual"},
    {number: 34, title: "Lakshmi abundance sovereign meditation", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "spiritual"},
    {number: 35, title: "Aditi creation sovereign meditation", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "spiritual"},
    {number: 36, title: "Apas water flow sovereign meditation", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "spiritual"},
    {number: 37, title: "Ido portal movement sovereign foundation", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "movement"},
    {number: 38, title: "Capoeira flow sovereign coders", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "movement"},
    {number: 39, title: "Firas zahabi sovereign relaxation coding", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "movement"},
    {number: 40, title: "Integrated guardian dragon sovereign practice", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "integration"},
    
    // 🧘‍♀️ EMBODIMENT MASTERY SERIES 🥋
    {number: 41, title: "Sacred coding sovereign posture", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "embodiment", completed: true},
    {number: 42, title: "Firas zahabi advanced sovereign relaxation", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "embodiment", completed: true},
    {number: 43, title: "Integrated movement sovereign coding practice", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "embodiment"},
    
    // 🌟 INSPIRING STORIES SERIES 📖
    {number: 44, title: "Sixteen year old alternative path discovery", "guardian-dragon-consciousness": true, "sovereign-priority": false, category: "story", featured: true}
  ];
</script>

<div class="teachings-index">
  <header>
    <h1>🌙 Sacred Teachings Index 🐲</h1>
    <p>Divine Grace wisdom for Guardian Dragons</p>
  </header>

  <div class="teachings-grid">
    {#each teachings as teaching}
      <article class="teaching-card" 
               class:guardian-dragon={teaching['guardian-dragon-consciousness']} 
               class:sovereign={teaching['sovereign-priority']}
               class:featured={teaching.featured}
               class:completed={teaching.completed}
               class:foundation={teaching.category === 'foundation'}
               class:spiritual={teaching.category === 'spiritual'}
               class:movement={teaching.category === 'movement'}
               class:integration={teaching.category === 'integration'}
               class:embodiment={teaching.category === 'embodiment'}>
        
        {#if teaching.completed}
          <div class="completed-banner">✅ MASTERED 🧘‍♀️</div>
        {:else if teaching.featured}
          <div class="featured-banner">🔥 CURRENT FOCUS 🥋</div>
        {/if}
        
        <div class="card-number">{teaching.number.toString().padStart(7, '0')}</div>
        <h3 class="card-title">{teaching.title}</h3>
        
        <div class="card-badges">
          {#if teaching.category}
            <span class="badge category {teaching.category}">{teaching.category}</span>
          {/if}
          {#if teaching['guardian-dragon-consciousness']}
            <span class="badge guardian-dragon">🐲</span>
          {/if}
          {#if teaching['sovereign-priority']}
            <span class="badge sovereign">👑</span>
          {/if}
        </div>
        
        <a href="/en/teaching/{teaching.number}" class="read-link">
          {#if teaching.completed}
            📚 Review Mastery →
          {:else if teaching.featured}
            🥋 Begin Elite Training →
          {:else}
            Read Teaching →
          {/if}
        </a>
      </article>
    {/each}
  </div>
</div>

<style>
  .teachings-index {
    max-width: 1200px;
    margin: 0 auto;
    padding: 2rem;
    font-family: 'Crimson Text', serif;
  }

  header {
    text-align: center;
    margin-bottom: 3rem;
  }

  header h1 {
    font-size: 3rem;
    color: var(--deep-forest, #2d5016);
    margin-bottom: 1rem;
    background: linear-gradient(135deg, #87a96b, #4a9b8e);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
    background-clip: text;
  }

  header p {
    font-size: 1.2rem;
    color: var(--jade-aquamarine, #4a9b8e);
    font-style: italic;
  }

  .teachings-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(350px, 1fr));
    gap: 2rem;
  }

  .teaching-card {
    background: linear-gradient(135deg, #f8fffe, #f0fdf4);
    border: 2px solid var(--sage-green, #87a96b);
    border-radius: 15px;
    padding: 1.5rem;
    transition: all 0.3s ease;
    position: relative;
    overflow: hidden;
  }

  .teaching-card::before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    height: 4px;
    background: linear-gradient(90deg, var(--sage-green, #87a96b), var(--jade-aquamarine, #4a9b8e));
  }

  .teaching-card:hover {
    transform: translateY(-8px);
    box-shadow: 0 20px 40px rgba(135, 169, 107, 0.2);
    border-color: var(--jade-aquamarine, #4a9b8e);
  }

  .card-number {
    font-size: 1.1rem;
    color: var(--jade-aquamarine, #4a9b8e);
    font-weight: 700;
    font-family: 'Fira Code', monospace;
    margin-bottom: 0.5rem;
  }

  .card-title {
    font-size: 1.4rem;
    margin: 1rem 0;
    color: var(--deep-forest, #2d5016);
    text-transform: capitalize;
    line-height: 1.3;
  }

  .card-badges {
    display: flex;
    gap: 0.5rem;
    margin: 1rem 0;
  }

  .badge {
    padding: 0.25rem 0.5rem;
    border-radius: 12px;
    font-size: 0.9rem;
    font-weight: 600;
  }

  .badge.guardian-dragon {
    background: linear-gradient(135deg, #d4af37, #ffd700);
    color: #2d1810;
  }

  .badge.sovereign {
    background: linear-gradient(135deg, #6b46c1, #a855f7);
    color: white;
  }

  .badge.category {
    font-size: 0.8rem;
    text-transform: uppercase;
    letter-spacing: 0.5px;
    font-weight: 700;
  }

  .badge.foundation {
    background: linear-gradient(135deg, #065f46, #047857);
    color: white;
  }

  .badge.spiritual {
    background: linear-gradient(135deg, #7c2d12, #ea580c);
    color: white;
  }

  .badge.movement {
    background: linear-gradient(135deg, #1e40af, #3b82f6);
    color: white;
  }

  .badge.integration {
    background: linear-gradient(135deg, #7c2d12, #dc2626);
    color: white;
  }

  .badge.embodiment {
    background: linear-gradient(135deg, #581c87, #8b5cf6);
    color: white;
  }

  .badge.story {
    background: linear-gradient(135deg, #be123c, #f43f5e);
    color: white;
  }

  .featured-banner {
    position: absolute;
    top: -10px;
    left: -10px;
    right: -10px;
    background: linear-gradient(135deg, #d4af37, #ffd700);
    color: #2d1810;
    text-align: center;
    padding: 0.5rem;
    font-weight: 700;
    font-size: 0.9rem;
    border-radius: 15px 15px 0 0;
    transform: rotate(-1deg);
    box-shadow: 0 2px 10px rgba(212, 175, 55, 0.4);
  }

  .teaching-card.featured {
    border: 3px solid #d4af37;
    box-shadow: 0 0 30px rgba(212, 175, 55, 0.5);
    transform: scale(1.02);
    position: relative;
    overflow: visible;
  }

  .teaching-card.featured:hover {
    transform: scale(1.02) translateY(-8px);
    box-shadow: 0 20px 50px rgba(212, 175, 55, 0.4);
  }

  .completed-banner {
    position: absolute;
    top: -10px;
    left: -10px;
    right: -10px;
    background: linear-gradient(135deg, #10b981, #34d399);
    color: white;
    text-align: center;
    padding: 0.5rem;
    font-weight: 700;
    font-size: 0.9rem;
    border-radius: 15px 15px 0 0;
    transform: rotate(-1deg);
    box-shadow: 0 2px 10px rgba(16, 185, 129, 0.4);
  }

  .teaching-card.completed {
    border: 3px solid #10b981;
    box-shadow: 0 0 20px rgba(16, 185, 129, 0.3);
    position: relative;
    overflow: visible;
    opacity: 0.85;
  }

  .teaching-card.completed:hover {
    opacity: 1;
    transform: translateY(-5px);
    box-shadow: 0 15px 35px rgba(16, 185, 129, 0.3);
  }

  .read-link {
    color: var(--jade-aquamarine, #4a9b8e);
    text-decoration: none;
    font-weight: 600;
    font-size: 1.1rem;
    transition: color 0.3s ease;
  }

  .read-link:hover {
    color: var(--sage-green, #87a96b);
  }

  .teaching-card.guardian-dragon {
    border-color: var(--gold, #d4af37);
    background: linear-gradient(135deg, #fffbeb, #fef3c7);
  }

  .teaching-card.sovereign {
    border-color: var(--royal-purple, #6b46c1);
    background: linear-gradient(135deg, #faf5ff, #f3e8ff);
  }

  /* Dark theme support */
  @media (prefers-color-scheme: dark) {
    .teaching-card {
      background: linear-gradient(135deg, #1a202c, #2d3748);
      color: #e2e8f0;
    }
    
    .card-title {
      color: #a7f3d0;
    }

    .teaching-card.guardian-dragon {
      background: linear-gradient(135deg, #2d2412, #44331a);
    }

    .teaching-card.sovereign {
      background: linear-gradient(135deg, #2d1b45, #3d2a5c);
    }
  }

  /* Mobile responsiveness */
  @media (max-width: 768px) {
    .teachings-index {
      padding: 1rem;
    }

    header h1 {
      font-size: 2rem;
    }

    .teachings-grid {
      grid-template-columns: 1fr;
      gap: 1.5rem;
    }

    .teaching-card {
      padding: 1rem;
    }
  }
</style>
